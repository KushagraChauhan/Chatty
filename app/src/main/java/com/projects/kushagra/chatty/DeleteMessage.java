package com.projects.kushagra.chatty;

/**
 * Created by Yashasvi on 16-04-2017.
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;
import android.app.AlertDialog;

public class DeleteMessage extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theDialog= new AlertDialog.Builder(getActivity());
        theDialog.setTitle(R.string.del_message);
        theDialog.setPositiveButton("Yeah", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity)getActivity()).delMessageBool();
                    }
                });
        theDialog.setNegativeButton("Nope", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getDialog().cancel();
                    }
                });
        return theDialog.create();
    }
}
