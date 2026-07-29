class TimeMap {
    private Map<String, TreeMap<Integer, String>> tmap;
    public TimeMap() {
        tmap= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        tmap.putIfAbsent(key, new TreeMap<>());
        tmap.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!tmap.containsKey(key)) return "";
        TreeMap<Integer, String> tree= tmap.get(key);
        Map.Entry<Integer, String> entry= tree.floorEntry(timestamp);
        return entry != null ? entry.getValue() : "";
    }
}
