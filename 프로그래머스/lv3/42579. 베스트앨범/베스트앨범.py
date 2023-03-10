def solution(genres, plays):
    answer = []
    genres_cnt = {}
    sorted_genres = {}
    for idx, data in enumerate(zip(genres, plays)):
        genre = data[0]
        play = data[1]

        if genre not in genres_cnt.keys():
            genres_cnt[genre] = 0

        if genre not in sorted_genres.keys():
            sorted_genres[genre] = []

        genres_cnt[genre] += play
        sorted_genres[genre].append([idx, play])
        idx += 1

    orders = sorted(genres_cnt, key=lambda x: -genres_cnt[x])
    for genre in orders:
        sorted_genres[genre].sort(key=lambda x: -x[1])

        for i in range(len(sorted_genres[genre])):
            if i > 1:
                break
            idx = sorted_genres[genre][i][0]
            answer.append(idx)

    return answer