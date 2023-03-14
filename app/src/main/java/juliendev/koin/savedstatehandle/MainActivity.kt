package juliendev.koin.savedstatehandle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<AbstractViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel
    }
}

class ViewModelImpl(savedStateHandle: SavedStateHandle) : AbstractViewModel()

abstract class AbstractViewModel : ViewModel()

