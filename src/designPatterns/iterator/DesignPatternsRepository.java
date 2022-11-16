package designPatterns.iterator;

public class DesignPatternsRepository implements Container {
    public String[] names = {"Composite", "Decorator", "Factory",
            "Factory method", "Iterator", "Prototype", "Proxy", "Singleton"};

    @Override
    public Iterator getIterator() {
        return new DesignPatternsIterator();
    }
    public Iterator getReversedIterator() {
        return new DesignPatternsReversedIterator();
    }

    private class DesignPatternsIterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            if(index >= names.length) {
                return false;
            }

            return true;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return names[index++];
            }

            return null;
        }
    }

    private class DesignPatternsReversedIterator implements Iterator {
        int index = names.length - 1;
        @Override
        public boolean hasNext() {
            if(index < 0) {
                return false;
            }

            return true;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return names[index--];
            }
            return null;
        }
    }
}

