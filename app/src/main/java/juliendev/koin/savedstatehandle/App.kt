package juliendev.koin.savedstatehandle

import android.app.Application
import android.util.Log
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(viewModelModule)
        }
        Log.e("koin", "started")
    }

}

val viewModelModule =
    module {
        viewModel<AbstractViewModel> { ViewModelImpl(savedStateHandle = get()) }
    }