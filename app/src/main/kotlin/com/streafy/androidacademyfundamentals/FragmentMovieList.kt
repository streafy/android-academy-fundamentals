package com.streafy.androidacademyfundamentals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FragmentMovieList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.movie_image).clipToOutline = true

        val movieCard: View = view.findViewById(R.id.movie_card)
        movieCard.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, FragmentMovieDetails())
                .addToBackStack(null)
                .commit()
        }
    }
}