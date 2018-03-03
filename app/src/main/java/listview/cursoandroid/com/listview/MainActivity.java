package listview.cursoandroid.com.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaItens;
    private String[] itens = {
            "Angra dos reias", "Caldas novas",
            "Campos do jordão", "Costa do Sauípe",
            "Monte alto","Jaboticabal","Ribeirão Preto",
            "Araraquara","Taquaritinga","Catanduva","Rio Preto","Pitangueiras",
            "São Paulo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        listaItens = findViewById(R.id.lisViewId);

        //cria um adaptador para a lista de itens
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adaptador);

//        implementa o método onclick para cada item da lista
      listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//             pega a posição do array para exibir o nome do item clicado.
              int codigoPosicao = position;
              String valorClicado = listaItens.getItemAtPosition(codigoPosicao).toString();

              Toast.makeText(getApplicationContext(),valorClicado, Toast.LENGTH_SHORT).show();
          }
      });







    }
}
