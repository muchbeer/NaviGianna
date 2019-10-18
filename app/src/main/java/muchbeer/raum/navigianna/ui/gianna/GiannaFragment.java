package muchbeer.raum.navigianna.ui.gianna;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import muchbeer.raum.navigianna.GadielFragment;
import muchbeer.raum.navigianna.GadielFragmentArgs;
import muchbeer.raum.navigianna.R;

public class GiannaFragment extends Fragment {

    private GiannaViewModel mViewModel;

    public static GiannaFragment newInstance() {
        return new GiannaFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.gianna_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GiannaViewModel.class);
        // TODO: Use the ViewModel

        //Implement method
        Button btnSend = getView().findViewById(R.id.btnSend);
       final EditText editText = getView().findViewById(R.id.edtSubmit);

       // final String sendParameter = editText.getText().toString();


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("GiannaFragment", "The value capture is: " + editText.getText().toString());

                Navigation.findNavController(view)
                        .navigate(GiannaFragmentDirections
                                .actionGiannaFragmentToGadielFragment()
                                .setUserName(editText.getText().toString()));
            }
        });
    }

}
