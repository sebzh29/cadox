package com.example.tp2cadox.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.tp2cadox.R
import com.example.tp2cadox.bo.Article
import com.example.tp2cadox.databinding.FragmentArticleAddEditBinding
import com.example.tp2cadox.repository.ArticleRepository
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class ArticleAddEditFragment : Fragment() {
    lateinit var binding : FragmentArticleAddEditBinding
    val args by navArgs<ArticleAddEditFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleAddEditBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = args.article
        binding.imageButtonSave.setOnClickListener{
            val articleToUpdate = Article(
                binding.article?.id?:0,
                binding.intituleArticle.text.toString(),
                binding.descriptionArticle.text.toString(),
                binding.prixArticle.text.toString().toDouble(),
                binding.ratingBarDegreEnvie.rating.toInt().toByte(),
                binding.urlArticle.text.toString(),
                binding.checkBoxIsAchete.isChecked,
                LocalDate.parse(binding.dateAchatArticle.text.toString(),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            )
            ArticleRepository.updateArticle(articleToUpdate)
            findNavController().popBackStack()
        }
    }

}