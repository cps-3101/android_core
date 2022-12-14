package ig.core.android.view.ui.activity.main

import androidx.lifecycle.ViewModelProvider
import ig.core.android.R
import ig.core.android.base.BaseActivity
import ig.core.android.databinding.ActivityMainBinding
import ig.core.android.di.Injection

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val mLayoutId = R.layout.activity_main
    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java
    override fun getViewModelFactory(): ViewModelProvider.Factory = Injection.provideDemoArchViewModelFactory(this)

    override fun initView() {
        onSetUpGeneralToolbar(getString(R.string.main_activity))
        stateFlowTest()

//        mBinding.txtLiveData.setOnClickListener {
//            mViewModel.usingLiveData()
//        }
//
//        mBinding.txtStateFlow.setOnClickListener {
//            mViewModel.usingStateFlow()
//        }
//
//        mBinding.txtFlow.setOnClickListener {
//            lifecycleScope.launch {
//                mViewModel.usingFlow().collectLatest {
//                    mBinding.txtFlow.text = "$it"
//                }
//            }
//        }

//        mBinding.txtSharedFlow.setOnClickListener {
//
//        }

        subscribeToObservables()
    }

    private fun subscribeToObservables() {
//        mViewModel.liveData.observe(this) {
//            mBinding.txtLiveData.text = it
//        }
//
//        lifecycleScope.launchWhenCreated {
//            mViewModel.stateFlow.collectLatest {
//                mBinding.txtStateFlow.text = it
//            }
//        }
    }

    private fun stateFlowTest() {
        gettingPostStateFlow()
    }

    private fun gettingPostStateFlow() {
//        mViewModel.getPost()
//        lifecycleScope.launchWhenStarted {
//            mViewModel.postStateFlow.collect {
////                when(it){
////                    is StateFlowResponse.Loading-> {
////                        Log.d("Main", "Loading....")
////                    }
////
////                    is StateFlowResponse.Failure -> {
////                        Log.d("Main", "onCreate: ${it.msg}")
////                    }
////
////                    is StateFlowResponse.Success<*> -> {
////                        Log.d("Main", "Success: ${it.data}")
////                    }
////                    is StateFlowResponse.Empty-> {
////                        Log.d("Main", "Empty....")
////                    }
////                }
//            }
//        }
    }

}
