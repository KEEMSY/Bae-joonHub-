def solution(genres, plays):
    genre_total_plays = {}
    songs_per_genre = {}
    
    for i, (genre, play) in enumerate(zip(genres, plays)):
        if genre not in genre_total_plays:
            genre_total_plays[genre] = 0
            songs_per_genre[genre] = []
        
        genre_total_plays[genre] += play
        songs_per_genre[genre].append((play, i))
    
    sorted_genres = sorted(genre_total_plays.items(), key=lambda x: x[1], reverse=True)
    
    for genre in songs_per_genre.keys():
        songs_per_genre[genre] = sorted(songs_per_genre[genre], key=lambda x: (-x[0], x[1]))
    
    best_album = []
    for genre, _ in sorted_genres:
        best_album.extend([song_idx for _, song_idx in songs_per_genre[genre][:2]])
    
    return best_album