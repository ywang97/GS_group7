/**
 * Copyright 2019 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import React from 'react';
import Highcharts from 'highcharts';

class LineChart extends React.Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
/*       TODO
            Create a highcharts line chart of your choosing (e.g. https://www.highcharts.com/demo/line-time-series for a demo).
*/
            Highcharts.chart('chart', {
                title: {
                    text: 'Stock Price'
                },
                xAxis: {
                    title: {
                        text: 'Date'
                    },
                    type: 'datetime'
                },
                yAxis: {
                    title: {
                        text: 'Price'
                    }
                },
                series: [{
                name: 'Prices',
                data: [245.97, 237.4,
                    237.4,
                    220.55,
                    220.55,
                    205.43,
                    192,
                    235.07,
                    207.68,
                    207.68,
                    207.68,
                    226.71,
                    244.82,
                    225.34,
                    225.34,
                    218.15,
                    236.29,
                    253.35,
                    242.83,
                    254.15,
                    225.34,
                    235.84,
                    224.29,
                    210.08,
                    210.08,
                    199.43,
                    199.43,
                    213.77,
                    187.99
                    203.95,
                    187.26,
                    199.5,
                    218.32,
                    218.32,
                    35.45,
                    235.45,
                    196.94,
                    222.98,
                    242.38,
                    216.7,
                    235.57,
                    235.57,
                    222.94,
                    235.08,
                    215.31,
                    233.41,
                    213.72,
                    213.72,
                    230.46,
                    219.9,
                    237.9,
                    226.41,
                    243.61,
                    253.94,
                    264.28,
                    251.53,
                    264.61,
                    248.97,
                    242.38,
                    231.23,
                    247.33,
                    235.08,
                    235.08,
                    238.49,
                    250.39,
                    232.79,
                    243.86,
                    262.78,]
                   // data: props.data
                   // data : [2.0, 4.9, 9.5, 14.5, 3.2, 21.5, 15.2, 8.5, 9.3, 18.3, 13.9, 9.6]
                    }]
        });

    }

    componentWillReceiveProps(props) {
        console.log("New data received to redraw chart.");
        
        /**
         * TODO
         * Parse the data received from props, a Javascript object, to map to a Javascript array
         * required by the type of line chart chosen and set it in the series. Use Date.UTC(..)
         * to create the x-axis.
         */
        
        /**
         * TODO
         * Uncomment the line below to pass the data be displayed to the series
         * this.chart.series[0].setData(data);
         */
    }

    componentWillUnmount() {
        this.chart.destroy();
    }


    render() {
        return (
            <div id='chart'></div>
        )
    }
}

// Don't forget to export your component!
