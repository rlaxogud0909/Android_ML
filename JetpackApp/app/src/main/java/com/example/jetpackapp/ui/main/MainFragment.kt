package com.example.jetpackapp.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.jetpackapp.R
import com.example.jetpackapp.databinding.MainFragmentBinding
import com.example.jetpackapp.BR.convertViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding:MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // UI를 구성하고 레이아웃의 데이터 바인딩 클래스 인스턴스를 생성 및 반환
        binding =  DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        // 바인딩 객체는 프래그먼트가 존재하는 동안만 메모리에 남아 있어야 하므로
        // 프래그먼트가 소멸될 때 바인딩 객체도 소멸되도록 바인딩 객체의 생명주기 소유자를 현재 프래그먼트로 선언
        binding.setLifecycleOwner(this)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.setVariable(convertViewModel, viewModel)
    }

}