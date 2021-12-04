package com.example.rogerac;

import  androidx.fragment.app.Fragment;

public interface Navegation  {
    void navegateTo(Fragment fragment, boolean addToBackstack);
}