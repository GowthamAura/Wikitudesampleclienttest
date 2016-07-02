package com.auraaz.wikitudesampleclienttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ArchitectView architectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
        final StartupConfiguration config = new StartupConfiguration( "mfPs9rB3zCqeUUiixer4SNLPUmFX7ieowX+27HRkwiTG6xkvCRsTHcF75GSb/ot4nJE5eXM7H3J0YrQZ+fU6ZIktyY1+Kb0HvKpb3C4UeYNrQZvoE9/4+ZpnJiqeeYSaEXhlxmd3zVrmX+xzHv+mgY5DE2Pw4PLyUDwKl0nTDj1TYWx0ZWRfX+n0jnsMC8Q9AzpW/DA6+O1fD0N8Hndi9BaWoaYImpMoK8X0UgM15xsFcn+Erkgzq0j3tw6AlE3yUxEeNBGFlPYzqHDdh3fGL8bKQPVCLeS5unaVIXlTAibLdR6vIO9svwJtbHXk4EPCRsuYfLseYq3qc4jyXrSofMes/FYGTjfEyhJPFhnu/+uaVfEWUkkx1h18KeXmIxpjuguVeXMWwFr4ynwdzGQuF4zYFazaH1IiRBoTpmZMXsTuHPvA5Im2mQiekj9oySCclHfFB0epcO3rLVGKx/Li2HKbO2dSm/d5+JAWUp1QWdtIYRDoAv1/mUOo04ebwwt5noB3t7MuNNZsPDH2K/oKtQ6S9FrxZwQKbj92lPKsUMYQTuDrTDLxqYyQKoIdxJSvKCMj5bKxEWLrxnxW3iKco9ahhpSPyijlvamI97toCCWLmwjWkkUMvyc1gdmAmjUweDKQkkp0tEHU2SQPaAvBTEPr0CitNwR4hN1dutdyNZk=" );
        this.architectView.onCreate( config );
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);

        architectView.onPostCreate();
        try {
            this.architectView.load( "file:///android_asset/demo/index.html" );
        } catch (IOException e) {
            e.printStackTrace();
         }
    }
    @Override
    protected void onResume(){
        super.onResume();

        architectView.onResume();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();

        architectView.onDestroy();
    }
    @Override
    protected void onPause(){
        super.onPause();

        architectView.onPause();
    }
}
