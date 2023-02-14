import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editReal;
    private TextView textDolar;
    private Button buttonConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editReal = findViewById(R.id.edit_real);
        textDolar = findViewById(R.id.text_dolar);
        buttonConverter = findViewById(R.id.button_converter);

        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtém o valor em reais inserido pelo usuário
                double real = Double.parseDouble(editReal.getText().toString());

                // Define a taxa de conversão atual de reais para dólares
                double taxa = 5.38;

                // Calcula o valor em dólares
                double dolar = real / taxa;

                // Exibe o valor em dólares na tela
                textDolar.setText(String.format("US$ %.2f", dolar));
            }
        });
    }
}
