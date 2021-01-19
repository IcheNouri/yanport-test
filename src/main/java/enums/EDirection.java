package enums;

import utils.Position;

public enum EDirection {
    N {
        @Override
        public Position getNextPOI() {
            return new Position(0, 1);
        }
    },
    E {
        @Override
        public Position getNextPOI() {
            return new Position(-1, 0);
        }
    },
    W {
        @Override
        public Position getNextPOI() {
            return new Position(1, 0);
        }
    },
    S {
        @Override
        public Position getNextPOI() {
            return new Position(0, -1);
        }
    };

    static public final EDirection[] values = values();

    public EDirection prev() {
        return values[(ordinal() - 1 + values.length) % values.length];
    }

    public EDirection next() {
        return values[(ordinal() + 1) % values.length];
    }

    public abstract Position getNextPOI();
}
