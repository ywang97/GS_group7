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
