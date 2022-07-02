package com.example.prova2.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.prova2.Home;
import com.example.prova2.MainActivity;
import com.example.prova2.R;
import com.example.prova2.bd.BDUsuario;
import com.example.prova2.model.Usuario;

public class EdicaoFragment extends Fragment implements View.OnClickListener {

    BDUsuario bdUsuario;
    String idUsuario;
    Usuario u;
    Button btSalvar;

    public EdicaoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        idUsuario = ((Home) getActivity()).getUserId();




        return inflater.inflate(R.layout.fragment_edicao_usuario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (idUsuario != null && !idUsuario.equals("")) {
            bdUsuario = BDUsuario.getInstance(getContext());
            u = bdUsuario.findByID(idUsuario);

            btSalvar = view.findViewById(R.id.btn_registrar_edicao);
            EditText txt_nome = view.findViewById(R.id.txt_nome_edicao);
            EditText txt_email = view.findViewById(R.id.txt_email_edicao);
            EditText txt_nome_usuario = view.findViewById(R.id.txt_nome_usuario_edicao);
            EditText txt_senha = view.findViewById(R.id.txt_login_senha_edicao);
            EditText txt_confirmar_senha = view.findViewById(R.id.txt_confirmar_senha_edicao);

            txt_nome.setText(u.getNome());
            txt_email.setText(u.getEmail());
            txt_nome_usuario.setText(u.getUsuario());

        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_registrar_edicao:
                bdUsuario = BDUsuario.getInstance(getContext());
                bdUsuario.
                break;
        }
    }
}