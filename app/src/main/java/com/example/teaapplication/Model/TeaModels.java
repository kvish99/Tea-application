package com.example.teaapplication.Model;

public class TeaModels {

    String teaname;

    int teaimage;

    public TeaModels(String teaname, int teaimage) {
        this.teaname = teaname;
        this.teaimage = teaimage;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public int getTeaimage() {
        return teaimage;
    }

    public void setTeaimage(int teaimage) {
        this.teaimage = teaimage;
    }
}
