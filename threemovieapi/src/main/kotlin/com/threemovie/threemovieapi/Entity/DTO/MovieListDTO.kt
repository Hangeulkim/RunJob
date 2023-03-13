package com.threemovie.threemovieapi.Entity.DTO

import com.querydsl.core.annotations.QueryProjection

data class MovieListDTO @QueryProjection constructor(
	val movieId: String = "",

	val nameKR: String = "",

	val nameEN: String = "",

	val poster: String? = "",

	val category: String = "",

	val steelcuts: String = "",

	val trailer: String = "",
)
