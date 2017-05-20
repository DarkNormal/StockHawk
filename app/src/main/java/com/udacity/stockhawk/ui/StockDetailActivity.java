package com.udacity.stockhawk.ui;

import android.os.Bundle;
import android.app.Activity;

import com.github.mikephil.charting.charts.LineChart;
import com.udacity.stockhawk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StockDetailActivity extends Activity {

    @BindView(R.id.stock_history_graph)
    LineChart historyGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_detail);
        ButterKnife.bind(this);
    }

}
