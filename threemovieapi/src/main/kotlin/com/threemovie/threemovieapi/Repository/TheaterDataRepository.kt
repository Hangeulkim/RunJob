package com.threemovie.threemovieapi.Repository

import com.threemovie.threemovieapi.Entity.PK.TheaterDataPK
import com.threemovie.threemovieapi.Entity.TheaterData
import org.springframework.data.jpa.repository.JpaRepository

interface TheaterDataRepository : JpaRepository<TheaterData, TheaterDataPK> {
}
