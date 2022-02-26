package com.example.swalismarket.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.swalismarket.databinding.LoginFragmentBinding
import com.example.swalismarket.viewmodels.SignInViewModel

class SignInFragment : Fragment() {

    private lateinit var binding: LoginFragmentBinding
    private val signInViewModel: SignInViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = LoginFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}