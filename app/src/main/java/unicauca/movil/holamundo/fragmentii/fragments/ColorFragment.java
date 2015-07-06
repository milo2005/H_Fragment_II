package unicauca.movil.holamundo.fragmentii.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import unicauca.movil.holamundo.fragmentii.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static final int COLOR_AZUL=0;
    public static final int COLOR_ROJO=1;
    public static final int COLOR_AMARILLO=2;
    public static final int COLOR_VERDE=3;
    public static final int COLOR_VIOLETA=4;
    public static final int COLOR_NARANJA=5;

    int color;

    public ColorFragment() {
        // Required empty public constructor
    }

    public void init(int color){
        this.color = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_color, container, false);

        int colors[] = getActivity().getResources().getIntArray(R.array.colores);
        String colorsN[] = getActivity().getResources().getStringArray(R.array.colores_n);

        TextView txt = (TextView) v.findViewById(R.id.name);

        v.setBackgroundColor(colors[color]);
        txt.setText(colorsN[color]);

        return v;

    }


}
