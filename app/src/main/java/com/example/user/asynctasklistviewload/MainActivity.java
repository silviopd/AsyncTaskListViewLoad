package com.example.user.asynctasklistviewload;


import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    final static String src[] = {
            "http://2.bp.blogspot.com/--1K042_Nqow/VTeCrXE5BWI/AAAAAAAANL8/XLQo5gp6Zyg/s1600/_01.png",
            "http://2.bp.blogspot.com/-CP_IoxhknOQ/VTeCrag0-eI/AAAAAAAANMk/ruCd93vcqog/s1600/_02.png",
            "http://4.bp.blogspot.com/-1SEeDGnn7D4/VTeCrciCRNI/AAAAAAAANMA/QgFw2Jf_lm0/s1600/_03.png",
            "http://2.bp.blogspot.com/-vHYm6GYJ2Tw/VTeCsNtXFTI/AAAAAAAANMI/ArqK_hgjPew/s1600/_04.png",
            "http://1.bp.blogspot.com/-VnWqZvcqNOs/VTeCse3md5I/AAAAAAAANMM/LTXVII_Wp9k/s1600/_05.png",
            "http://3.bp.blogspot.com/-4LESmLLwFjU/VTeCs45dC4I/AAAAAAAANMg/r09uJJWk6qA/s1600/_06.png",
            "http://4.bp.blogspot.com/-AMGvPNdG6j0/VTeCs2swa2I/AAAAAAAANMc/NIg_i_2Et-A/s1600/_07.png",
            "http://4.bp.blogspot.com/-B59pQ2j1EtM/VTeCtsyD_QI/AAAAAAAANMo/7RvxFyINnr8/s1600/_08.png",
            "http://2.bp.blogspot.com/-VIUzes38Bro/VTeCuBX3dvI/AAAAAAAANMs/kiJM9ldSVho/s1600/_09.png",
            "http://4.bp.blogspot.com/-v618GyhX5U4/VTeCubGY43I/AAAAAAAANMw/X0uDVglfi1Q/s1600/_10.png",
            "http://2.bp.blogspot.com/-nhmSxu382f0/VTeCueNlxUI/AAAAAAAANM0/aan0OhOAStc/s1600/_11.png",
            "http://4.bp.blogspot.com/-WhB2MPTlGJk/VTeCuiosK6I/AAAAAAAANM4/ZdThfC14dOA/s1600/_12.png"};

    ListView imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageList = (ListView) findViewById(R.id.imagelist);
        ArrayList<String> srcList = new ArrayList<String>(Arrays.asList(src));
        imageList.setAdapter(new CustomListAdapter(this, srcList));
    }
}