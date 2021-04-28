package edu.cnm.deepdive.colorpicker;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.appcompat.app.AppCompatActivity;
import edu.cnm.deepdive.colorpicker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private static final int SLIDER_MIN = 0;
  private static final int SLIDER_MAX = 255;
  private static final int DEFAULT_VALUE = 100;
  private static final String RED_LABEL = "Red: %d";
  private static final String GREEN_LABEL = "Green: %d";
  private static final String BLUE_LABEL = "Blue: %d";
  private static final int COLOR_VALUE_DEFAULT = Color.BLACK;

  private ActivityMainBinding binding;
  private int redValue;
  private int greenValue;
  private int blueValue;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityMainBinding.inflate(getLayoutInflater(), null, false);
    setContentView(binding.getRoot());
    binding.colorDisplay.setBackgroundColor(COLOR_VALUE_DEFAULT);
    setupRedSlider();
    setupGreenSlider();
    setupBlueSlider();
  }

  private void setupRedSlider() {
    SeekBar seekBar = binding.redSlider;
    seekBar.setMin(SLIDER_MIN);
    seekBar.setMax(SLIDER_MAX);
    seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
      @SuppressLint("DefaultLocale")
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        binding.redLabel.setText(String.format(RED_LABEL, progress));
        redValue = progress;
        binding.colorDisplay.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {
      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {
      }
    });
    seekBar.setProgress(DEFAULT_VALUE);
  }

  private void setupGreenSlider() {
    SeekBar seekBar = binding.greenSlider;
    seekBar.setMin(SLIDER_MIN);
    seekBar.setMax(SLIDER_MAX);
    seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
      @SuppressLint("DefaultLocale")
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        binding.greenLabel.setText(String.format(GREEN_LABEL, progress));
        greenValue = progress;
        binding.colorDisplay.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {
      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {
      }
    });
    seekBar.setProgress(DEFAULT_VALUE);
  }

  private void setupBlueSlider() {
    SeekBar seekBar = binding.blueSlider;
    seekBar.setMin(SLIDER_MIN);
    seekBar.setMax(SLIDER_MAX);
    seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
      @SuppressLint("DefaultLocale")
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        binding.blueLabel.setText(String.format(BLUE_LABEL, progress));
        blueValue = progress;
        binding.colorDisplay.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {
      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {
      }
    });
    seekBar.setProgress(DEFAULT_VALUE);
  }

}