class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {

        val genreTotalPlays = mutableMapOf<String, Int>()
        val genreSongs = mutableMapOf<String, MutableList<Pair<Int, Int>>>()

        for (i in genres.indices) {
            val genre = genres[i]
            val playCount = plays[i]

            genreTotalPlays[genre] = genreTotalPlays.getOrDefault(genre, 0) + playCount

            if (!genreSongs.containsKey(genre)) {
                genreSongs[genre] = mutableListOf(Pair(i, playCount))
            } else {
                genreSongs[genre]?.add(Pair(i, playCount))
            }
        }

        val sortedGenres = genreTotalPlays.entries.sortedByDescending { it.value }.map { it.key }

        val bestAlbum = mutableListOf<Int>()

        for (genre in sortedGenres) {
            val sortedSongs = genreSongs[genre]?.sortedWith(compareBy({ -it.second }, { it.first }))

            if (sortedSongs != null) {
                for (i in sortedSongs.indices) {
                    if (i < 2) {
                        bestAlbum.add(sortedSongs[i].first)
                    } else {
                        break
                    }
                }
            }
        }

        return bestAlbum.toIntArray()
    }
}