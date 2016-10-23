package com.purplechai.speechapptest;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

import java.util.Locale;

public class ConvertToSpeech extends Activity implements OnInitListener {

    private TextToSpeech tts;
    private Button bSpeak;
    Locale passarg;
    private static final Language Russian = Language.RUSSIAN;
    private static final Language Hindi = Language.HINDI;
    private static final Language Italian = Language.ITALIAN;
    private static final Language French = Language.FRENCH;
    private static final Language German = Language.GERMAN;
    private static final Language Japanese = Language.JAPANESE;

    private Button bTranslate,bTranslateToHindi,bTranslateToRussian, bTranslateToJapanese, bTranslateToItalian,bTranslateToFrench;
    private EditText etUserText;
    String text;
    String lang;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_to_speech);
        bSpeak = (Button)findViewById(R.id.bSpeak);
        bTranslate = (Button)findViewById(R.id.bTranslateToGerman);
        bTranslateToFrench = (Button)findViewById(R.id.bTranslateToFrench);
        bTranslateToHindi = (Button)findViewById(R.id.bTranslateToHindi);
        bTranslateToItalian = (Button)findViewById(R.id.bTranslateToItalian);
        bTranslateToJapanese = (Button)findViewById(R.id.bTranslateToJapanese);
        bTranslateToRussian = (Button)findViewById(R.id.bTranslateToRussian);

        etUserText = (EditText)findViewById(R.id.etUserText);

        tts = new TextToSpeech(this, this);
        bSpeak.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                speakOut(((TextView) findViewById(R.id.tvTranslatedText)).getText().toString());
            }
        });

        bTranslate.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                text = etUserText.getText().toString();
                lang = "German";
                class bgStuff extends AsyncTask<Void, Void, Void>{

                    String translatedText = "";
                    @Override
                    protected Void doInBackground(Void... params) {
                        // TODO Auto-generated method stub
                        try {
                            translatedText = translate(text, lang);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            translatedText = e.toString();
                        }

                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        // TODO Auto-generated method stub
                        ((TextView) findViewById(R.id.tvTranslatedText)).setText(translatedText);
                        super.onPostExecute(result);
                    }

                }

                new bgStuff().execute();
            }
        });

        bTranslateToRussian.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                text = etUserText.getText().toString();
                lang = "Russian";
                class bgStuff extends AsyncTask<Void, Void, Void>{

                    String translatedText = "";
                    @Override
                    protected Void doInBackground(Void... params) {
                        // TODO Auto-generated method stub
                        try {
                            translatedText = translate(text, lang);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            translatedText = e.toString();
                        }

                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        // TODO Auto-generated method stub
                        ((TextView) findViewById(R.id.tvTranslatedText)).setText(translatedText);
                        super.onPostExecute(result);
                    }

                }

                new bgStuff().execute();
            }
        });

        bTranslateToHindi.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                text = etUserText.getText().toString();
                lang = "Hindi";
                class bgStuff extends AsyncTask<Void, Void, Void>{

                    String translatedText = "";
                    @Override
                    protected Void doInBackground(Void... params) {
                        // TODO Auto-generated method stub
                        try {
                            translatedText = translate(text, lang);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            translatedText = e.toString();
                        }

                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        // TODO Auto-generated method stub
                        ((TextView) findViewById(R.id.tvTranslatedText)).setText(translatedText);
                        super.onPostExecute(result);
                    }

                }

                new bgStuff().execute();
            }
        });

        bTranslateToItalian.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                text = etUserText.getText().toString();
                lang = "Italian";
                class bgStuff extends AsyncTask<Void, Void, Void>{

                    String translatedText = "";
                    @Override
                    protected Void doInBackground(Void... params) {
                        // TODO Auto-generated method stub
                        try {
                            translatedText = translate(text, lang);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            translatedText = e.toString();
                        }

                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        // TODO Auto-generated method stub
                        ((TextView) findViewById(R.id.tvTranslatedText)).setText(translatedText);
                        super.onPostExecute(result);
                    }

                }

                new bgStuff().execute();
            }
        });

        bTranslateToFrench.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                text = etUserText.getText().toString();
                lang = "French";
                class bgStuff extends AsyncTask<Void, Void, Void>{

                    String translatedText = "";
                    @Override
                    protected Void doInBackground(Void... params) {
                        // TODO Auto-generated method stub
                        try {
                            translatedText = translate(text, lang);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            translatedText = e.toString();
                        }

                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        // TODO Auto-generated method stub
                        ((TextView) findViewById(R.id.tvTranslatedText)).setText(translatedText);
                        super.onPostExecute(result);
                    }

                }

                new bgStuff().execute();
            }
        });

        bTranslateToJapanese.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                text = etUserText.getText().toString();
                lang = "Japanese";
                class bgStuff extends AsyncTask<Void, Void, Void>{

                    String translatedText = "";
                    @Override
                    protected Void doInBackground(Void... params) {
                        // TODO Auto-generated method stub
                        try {
                            translatedText = translate(text, lang);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            translatedText = e.toString();
                        }

                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        // TODO Auto-generated method stub
                        ((TextView) findViewById(R.id.tvTranslatedText)).setText(translatedText);
                        super.onPostExecute(result);
                    }

                }

                new bgStuff().execute();
            }
        });


    }

    public String translate(String text, String lang) throws Exception{


        // Set the Client ID / Client Secret once per JVM. It is set statically and applies to all services
        Translate.setClientId("shubham12345678"); //Change this
        Translate.setClientSecret("Dckg2uWldwo0Mb+yUb66pT27LNdZ80ES9oDab8/9YGk="); //change

        String translatedText = "";
        if(lang.equals("German")) {
            translatedText = Translate.execute(text,German);
            passarg = Locale.GERMAN;
        }
        else if(lang.equals("Russian")){
            translatedText = Translate.execute(text,Russian);
            passarg = Locale.ENGLISH;
        }
        else if(lang.equals("French")){
            translatedText = Translate.execute(text,French);
            passarg = Locale.FRENCH;
        }
        else if(lang.equals("Hindi")){
            translatedText = Translate.execute(text,Hindi);
            passarg = Locale.ENGLISH;
        }
        else if(lang.equals("Japanese")){
            translatedText = Translate.execute(text,Japanese);
            passarg = Locale.JAPANESE;
        }
        else if(lang.equals("Italian")){
            translatedText = Translate.execute(text,Italian);
            passarg = Locale.ITALIAN;
        }
        return translatedText;
    }

    @Override
    public void onInit(int status) {
        // TODO Auto-generated method stub
        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(passarg);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {

                //speakOut("Ich");
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }
    }

    private void speakOut(String text) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

}