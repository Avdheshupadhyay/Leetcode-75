class SmallestInfiniteSet {
    HashSet<Integer> set;
    int i = 1;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        for (int j = 1; j <= 1000; j++)
            set.add(j);
    }

    public int popSmallest() {
        while (!set.contains(i))
            i++;
        set.remove(i);
        return i++;

    }

    public void addBack(int num) {
        if (!set.contains(num)) {
            set.add(num);
            if (num < i)
                i = num;
        }
    }
}