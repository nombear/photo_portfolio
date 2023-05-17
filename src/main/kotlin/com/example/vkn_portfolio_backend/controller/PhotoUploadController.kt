package com.example.vkn_portfolio_backend.controller

import com.example.vkn_portfolio_backend.services.PhotoUploader
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class PhotoUploadController(val photoUploader: PhotoUploader) {

    @PostMapping
    fun uploadPhoto(@RequestParam("file") file: MultipartFile): String {
        photoUploader.uploadPicture(file)
        return ""
    }

    @GetMapping
    fun retrievePhoto(@RequestParam("photoName") photoName: String): MultipartFile? {
        return null
    }
}