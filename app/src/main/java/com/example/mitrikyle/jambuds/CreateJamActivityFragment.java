package com.example.mitrikyle.jambuds;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A placeholder fragment containing a simple view.
 */
public class CreateJamActivityFragment extends Fragment {

    public final static String EXTRA_MESSAGE = "com.example.mitrikyle.jambuds.MESSAGE";

    public CreateJamActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_create_jam, container, false);
    }

    /**Called when the user clicks the Submit button
     * For test purposes
     */
    public void submitMessage(View view) {
        Intent intent = new Intent(getActivity(), CreateJamActivity.class);
        EditText editText = (EditText) view.findViewById(R.id.enter_title_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
