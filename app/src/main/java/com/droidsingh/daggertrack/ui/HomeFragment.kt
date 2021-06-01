package com.droidsingh.daggertrack.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.droidsingh.daggertrack.HeavyDependencyOne
import com.droidsingh.daggertrack.HeavyDependencyTwo
import com.droidsingh.daggertrack.R
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class HomeFragment : Fragment() {

    @Inject
    lateinit var heavyDependencyOne: HeavyDependencyOne
    @Inject
    lateinit var heavyDependencyTwo: HeavyDependencyTwo

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}