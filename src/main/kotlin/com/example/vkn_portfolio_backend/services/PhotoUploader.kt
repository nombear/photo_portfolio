package com.example.vkn_portfolio_backend.services

import com.example.vkn_portfolio_backend.persistence.PersistenceService
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class PhotoUploader(val persistenceLayer : PersistenceService){
    fun uploadPicture(file: MultipartFile) : Boolean {
        return persistenceLayer.persist(file)
    }
}
