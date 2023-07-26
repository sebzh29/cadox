package com.example.tp2cadox.ui.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.example.tp2cadox.R
import com.example.tp2cadox.databinding.ActivityDetailArticleBinding
import com.example.tp2cadox.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class DetailArticleActivity : AppCompatActivity() {
    lateinit var adab : ActivityDetailArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adab = DataBindingUtil.setContentView(
            this,R.layout.activity_detail_article)
        adab.article = ArticleRepository.getArticle(0)

        adab.imageButtonEdit.setOnClickListener{
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Voulez-vous modifier cet article")
                .setTitle("Edition article")
                .setPositiveButton("Oui"){dialogInterface: DialogInterface, i: Int -> }
                .setNegativeButton("non"){dialogInterface: DialogInterface, i: Int -> }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        adab.imageButtonUrl.setOnClickListener{
            Toast.makeText(this,adab.article?.url?: "Pas d'URL", Toast.LENGTH_SHORT).show()
        }

        adab.imageButtonSend.setOnClickListener{
            Snackbar.make(adab.root, "Le message est envoyé (frais estimé 50.65€)",
            Snackbar.LENGTH_LONG).show()
        }
    }
}