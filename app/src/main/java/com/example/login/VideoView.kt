package com.example.login

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView


class VideoView : AppCompatActivity() {
    private lateinit var videoView:VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view);
        var fragment = layoutInflater.inflate(R.layout.activity_video_view,,false)
        videoView=fragment.findViewById(R.id.videoView1)


        val mediaController= MediaController(this)
        mediaController.setAnchorView(videoView)

        val onlineUri:Uri = Uri.parse("https://cdn.videvo.net/videvo_files/video/free/2014-08/large_watermarked/Earth_Zoom_In_preview.mp4")
        val offlineUri:Uri =Uri.parse("android.resource://$packageName/${R.raw.videoexample}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()
    }
}