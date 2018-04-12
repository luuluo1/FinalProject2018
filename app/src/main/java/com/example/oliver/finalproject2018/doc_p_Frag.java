package com.example.oliver.finalproject2018;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.oliver.finalproject2018.R;
import com.example.oliver.finalproject2018.dummy.Doc_patient;
import com.example.oliver.finalproject2018.dummy.Doc_patientDao;
import com.example.oliver.finalproject2018.dummy.PatientDatabaseHelper;

import java.util.List;


public class doc_p_Frag extends Fragment    {

    public static final String TAG="AddDocPatient";
    private EditText dTxtName;
    private EditText dTxtAddress;
    private EditText dTxtBirth;
    private EditText dTxtPhone;
    private EditText dTxtHCard;
    private EditText dDescr;
    private EditText dPre;
    private EditText dAllergy;

    private Doc_patientDao doc_patientDao;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        }




    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doc__patient_,container,false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        dTxtName=getView().findViewById(R.id.doc_pat_name);
        dDescr=getView().findViewById(R.id.doc_pat_description);
        dAllergy=getView().findViewById(R.id.doc_pat_allergies);
        dTxtAddress=getView().findViewById(R.id.doc_pat_address);
        dTxtBirth=getView().findViewById(R.id.doc_pat_birthday);
        dPre=getView().findViewById(R.id.doc_pat_previous_surg);
        dTxtPhone=getView().findViewById(R.id.doc_pat_phone_number);
        dTxtHCard=getView().findViewById(R.id.doc_pat_health_number);





        Button sub_btn=getView().findViewById(R.id.doc_submit);
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PatientDatabaseHelper pd=new PatientDatabaseHelper(getContext());
                SQLiteDatabase db=pd.getWritableDatabase();

                ContentValues cv=new ContentValues();

                cv.put(PatientDatabaseHelper.COLUMN_PHONE,dTxtPhone.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_DESCRIPTION,dDescr.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_NAME,dTxtName.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_HEALTH_CARD,dTxtHCard.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_ALERGIES,dAllergy.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_SURGERIES,dPre.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_BIRTH,dTxtBirth.getText().toString());
                cv.put(PatientDatabaseHelper.COLUMN_ADDRESS,dTxtAddress.getText().toString());

                db.insert(PatientDatabaseHelper.TABLE_DOC_PATIENT,null,cv);

                Intent i1=new Intent(getContext(),pif_doc_patientlist.class);
                startActivity(i1);

            }
        });
    }


}
