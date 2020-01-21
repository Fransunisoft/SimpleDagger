package com.example.simpledagger.di.modules;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.simpledagger.di.ViewModelKey;
import com.example.simpledagger.remote.UserService;
import com.example.simpledagger.viewModel.UserViewModel;
import com.example.simpledagger.viewModel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindViewModel(UserViewModel userViewModel);


    @Binds
    abstract ViewModelProvider.Factory bindFactory(ViewModelFactory factory);

}
