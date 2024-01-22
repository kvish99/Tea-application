package com.example.teaapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.teaapplication.Adapter.HorizontalAdapter;
import com.example.teaapplication.Adapter.HorizontalItemAdapter;
import com.example.teaapplication.Model.TeaModels;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.hrecyclerview);
        RecyclerView recyclerView1 = view.findViewById(R.id.horizontalitems);
        ImageSlider imageSlider = view.findViewById(R.id.imageslid);

        // Create a list of slide models
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.gaippt, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.teatea, ScaleTypes.FIT)); // Corrected the typo here
        slideModels.add(new SlideModel(R.drawable.teatea1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.teatea2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.gaippt, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.teatea1, ScaleTypes.FIT));

        // Set the image list to the ImageSlider
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        List<TeaModels> teaModelsList = new ArrayList<>();

        TeaModels tea1 = new TeaModels("Oolong Tea",R.drawable.chaimodified);
        TeaModels tea2 = new TeaModels("Red label", R.drawable.redlabel);
        TeaModels tea3 = new TeaModels("Sayoo Tea", R.drawable.saayomodified);
        TeaModels tea4 = new TeaModels("Matcha Tea", R.drawable.matchamodified); // Corrected the typo here
        TeaModels tea5 = new TeaModels("Red label", R.drawable.redlabel);
        TeaModels tea6 = new TeaModels("Oolong Tea", R.drawable.chai1);
        TeaModels tea7 = new TeaModels("Matcha Tea", R.drawable.matchamodified);

        teaModelsList.add(tea1);
        teaModelsList.add(tea2);
        teaModelsList.add(tea3);
        teaModelsList.add(tea4);
        teaModelsList.add(tea5);
        teaModelsList.add(tea6);
        teaModelsList.add(tea7);


        HorizontalItemAdapter horizontalItemAdapter = new HorizontalItemAdapter(teaModelsList,requireContext());
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setAdapter(horizontalItemAdapter);

        HorizontalAdapter horizontalAdapter = new HorizontalAdapter(teaModelsList, requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(horizontalAdapter);

        return view;
    }
}