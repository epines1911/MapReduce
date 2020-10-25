package edu.utap.mapreduce.model

class Stage {
    private var rooms = emptyList<Room>().toMutableList()
    private var n: Int

    constructor(n: Int) {
        for (x in 0 until n * n) {
            rooms.add(Room())
        }
        this.n = n
    }
}
