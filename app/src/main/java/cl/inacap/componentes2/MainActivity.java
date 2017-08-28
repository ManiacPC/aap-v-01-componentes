package cl.inacap.componentes2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton tBtnTest;
    private TextView tvToggleButton;

    private CheckBox cbTest;
    private TextView tvCheckbox;

    private TextView tvRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        tBtnTest = (ToggleButton) findViewById(R.id.tBtnTest);

        tBtnTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });*/

    }

    /* Método ToggleButton */
                                            // view = tBtnTest
    public void verificarToggleButton(View view) {
        tBtnTest = (ToggleButton) findViewById(R.id.tBtnTest);
        tvToggleButton = (TextView) findViewById(R.id.tvToggleButton);

        if (tBtnTest.isChecked()) {
            tvToggleButton.setText("Activado");
        } else {
            tvToggleButton.setText("Desactivado");
        }
    }

    /* Método Checkbox */
                                    // view = cbTest
    public void verificarCheckBox(View view) {
        cbTest = (CheckBox) findViewById(R.id.cbTest);
        tvCheckbox = (TextView) findViewById(R.id.tvCheckbox);

        if (cbTest.isChecked()) {
            tvCheckbox.setText("Seleccionado");
        } else {
            tvCheckbox.setText("No seleccionado");
        }

    }

                                        // view = rbTest1 ó rbTest2
    public void verificarRadioButton(View view)
    {
        // Obtiene el elemento radiobutton y su estado (checked)
        RadioButton botonSeleccionado = (RadioButton) view;
        boolean checked = botonSeleccionado.isChecked();

        tvRadio = (TextView) findViewById(R.id.tvRadioButton);

        switch(view.getId()) {
            case R.id.rbTest1:
                if (checked) tvRadio.setText("Radio1 seleccionado");
                break;
            case R.id.rbTest2:
                if (checked) tvRadio.setText("Radio2 seleccionado");
                break;
        }

    }



}
