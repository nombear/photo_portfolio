package com.example.vkn_portfolio_backend.persistence

import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class PersistenceService {
    fun persist(file:MultipartFile) : Boolean {
        return false
    }
}
