
function mapSphere() {
    var opts;
    $.ajax({
        url: contextPath + '/lab/labAjax',
        async: false,
        success: function (mData) {
            var markPointStyle = {
                normal: {
                    color: '#fbf679'
                }
            };
            // Airport: [name（机场名？）, city, country, longitude（经度）, latitude（纬度）]
            //map和forEach都可以对数组进行遍历，区别是map可以返回一个修改后的数组，但不影响原数组
            var airports = getAirports(mData, markPointStyle);
            // Route: [airlineIndex(航空公司编号), sourceAirportIndex（起点）, destinationAirportIndex（终点）]


            opts = {
                title: {
                    show: false,
                    // text: '全球实验中心互联，加速产品迭代升级，创用户最佳体验',
                    text: '数据互联   实时共享  提效增值 ',
                    //subtext: '数据纯属虚构',
                    x: 'center',
                    textStyle: {
                        color: '#fff',
                        // fontSize: bodyScale * 21,
                        fontFamily: '"Microsoft yahei", "微软雅黑", Sans Serif',
                        fontWeight: "normal"
                    }
                },
                legend: {
                    show: false,
                    //   遍历航空公司名称显示图例
                    data: legendData(mData),
                    selected: {},
                    x: 'center',
                    y: "bottom",
                    // orient: 'vertical',
                    textStyle: {
                        color: 'white'
                    }
                },
                tooltip: {
                    formatter: '{b}'
                },
                series: [{
                    type: 'map3d',
                    mapType: 'world',
                    nameMap: {
                        'Afghanistan': '阿富汗',
                        'Angola': '安哥拉',
                        'Albania': '阿尔巴尼亚',
                        'United Arab Emirates': '阿联酋',
                        'Argentina': '阿根廷',
                        'Armenia': '亚美尼亚',
                        'French Southern and Antarctic Lands': '法属南半球和南极领地',
                        'Australia': '澳大利亚',
                        'Austria': '奥地利',
                        'Azerbaijan': '阿塞拜疆',
                        'Burundi': '布隆迪',
                        'Belgium': '比利时',
                        'Benin': '贝宁',
                        'Burkina Faso': '布基纳法索',
                        'Bangladesh': '孟加拉国',
                        'Bulgaria': '保加利亚',
                        'The Bahamas': '巴哈马',
                        'Bosnia and Herzegovina': '波斯尼亚和黑塞哥维那',
                        'Belarus': '白俄罗斯',
                        'Belize': '伯利兹',
                        'Bermuda': '百慕大',
                        'Bolivia': '玻利维亚',
                        'Brazil': '巴西',
                        'Brunei': '文莱',
                        'Bhutan': '不丹',
                        'Botswana': '博茨瓦纳',
                        'Central African Republic': '中非共和国',
                        'Canada': '加拿大',
                        'Switzerland': '瑞士',
                        'Chile': '智利',
                        'China': '中国',
                        'Ivory Coast': '象牙海岸',
                        'Cameroon': '喀麦隆',
                        'Democratic Republic of the Congo': '刚果民主共和国',
                        'Republic of the Congo': '刚果共和国',
                        'Colombia': '哥伦比亚',
                        'Costa Rica': '哥斯达黎加',
                        'Cuba': '古巴',
                        'Northern Cyprus': '北塞浦路斯',
                        'Cyprus': '塞浦路斯',
                        'Czech Republic': '捷克共和国',
                        'Germany': '德国',
                        'Djibouti': '吉布提',
                        'Denmark': '丹麦',
                        'Dominican Republic': '多明尼加共和国',
                        'Algeria': '阿尔及利亚',
                        'Ecuador': '厄瓜多尔',
                        'Egypt': '埃及',
                        'Eritrea': '厄立特里亚',
                        'Spain': '西班牙',
                        'Estonia': '爱沙尼亚',
                        'Ethiopia': '埃塞俄比亚',
                        'Finland': '芬兰',
                        'Fiji': '斐',
                        'Falkland Islands': '福克兰群岛',
                        'France': '法国',
                        'Gabon': '加蓬',
                        'United Kingdom': '英国',
                        'Georgia': '格鲁吉亚',
                        'Ghana': '加纳',
                        'Guinea': '几内亚',
                        'Gambia': '冈比亚',
                        'Guinea Bissau': '几内亚比绍',
                        'Equatorial Guinea': '赤道几内亚',
                        'Greece': '希腊',
                        'Greenland': '格陵兰',
                        'Guatemala': '危地马拉',
                        'French Guiana': '法属圭亚那',
                        'Guyana': '圭亚那',
                        'Honduras': '洪都拉斯',
                        'Croatia': '克罗地亚',
                        'Haiti': '海地',
                        'Hungary': '匈牙利',
                        'Indonesia': '印尼',
                        'India': '印度',
                        'Ireland': '爱尔兰',
                        'Iran': '伊朗',
                        'Iraq': '伊拉克',
                        'Iceland': '冰岛',
                        'Israel': '以色列',
                        'Italy': '意大利',
                        'Jamaica': '牙买加',
                        'Jordan': '约旦',
                        'Japan': '日本',
                        'Kazakhstan': '哈萨克斯坦',
                        'Kenya': '肯尼亚',
                        'Kyrgyzstan': '吉尔吉斯斯坦',
                        'Cambodia': '柬埔寨',
                        'South Korea': '韩国',
                        'Kosovo': '科索沃',
                        'Kuwait': '科威特',
                        'Laos': '老挝',
                        'Lebanon': '黎巴嫩',
                        'Liberia': '利比里亚',
                        'Libya': '利比亚',
                        'Sri Lanka': '斯里兰卡',
                        'Lesotho': '莱索托',
                        'Lithuania': '立陶宛',
                        'Luxembourg': '卢森堡',
                        'Latvia': '拉脱维亚',
                        'Morocco': '摩洛哥',
                        'Moldova': '摩尔多瓦',
                        'Madagascar': '马达加斯加',
                        'Mexico': '墨西哥',
                        'Macedonia': '马其顿',
                        'Mali': '马里',
                        'Myanmar': '缅甸',
                        'Montenegro': '黑山',
                        'Mongolia': '蒙古',
                        'Mozambique': '莫桑比克',
                        'Mauritania': '毛里塔尼亚',
                        'Malawi': '马拉维',
                        'Malaysia': '马来西亚',
                        'Namibia': '纳米比亚',
                        'New Caledonia': '新喀里多尼亚',
                        'Niger': '尼日尔',
                        'Nigeria': '尼日利亚',
                        'Nicaragua': '尼加拉瓜',
                        'Netherlands': '荷兰',
                        'Norway': '挪威',
                        'Nepal': '尼泊尔',
                        'New Zealand': '新西兰',
                        'Oman': '阿曼',
                        'Pakistan': '巴基斯坦',
                        'Panama': '巴拿马',
                        'Peru': '秘鲁',
                        'Philippines': '菲律宾',
                        'Papua New Guinea': '巴布亚新几内亚',
                        'Poland': '波兰',
                        'Puerto Rico': '波多黎各',
                        'North Korea': '北朝鲜',
                        'Portugal': '葡萄牙',
                        'Paraguay': '巴拉圭',
                        'Qatar': '卡塔尔',
                        'Romania': '罗马尼亚',
                        'Russia': '俄罗斯',
                        'Rwanda': '卢旺达',
                        'Western Sahara': '西撒哈拉',
                        'Saudi Arabia': '沙特阿拉伯',
                        'Sudan': '苏丹',
                        'South Sudan': '南苏丹',
                        'Senegal': '塞内加尔',
                        'Solomon Islands': '所罗门群岛',
                        'Sierra Leone': '塞拉利昂',
                        'El Salvador': '萨尔瓦多',
                        'Somaliland': '索马里兰',
                        'Somalia': '索马里',
                        'Republic of Serbia': '塞尔维亚共和国',
                        'Suriname': '苏里南',
                        'Slovakia': '斯洛伐克',
                        'Slovenia': '斯洛文尼亚',
                        'Sweden': '瑞典',
                        'Swaziland': '斯威士兰',
                        'Syria': '叙利亚',
                        'Chad': '乍得',
                        'Togo': '多哥',
                        'Thailand': '泰国',
                        'Tajikistan': '塔吉克斯坦',
                        'Turkmenistan': '土库曼斯坦',
                        'East Timor': '东帝汶',
                        'Trinidad and Tobago': '特里尼达和多巴哥',
                        'Tunisia': '突尼斯',
                        'Turkey': '土耳其',
                        'United Republic of Tanzania': '坦桑尼亚联合共和国',
                        'Uganda': '乌干达',
                        'Ukraine': '乌克兰',
                        'Uruguay': '乌拉圭',
                        'United States of America': '美国',
                        'Uzbekistan': '乌兹别克斯坦',
                        'Venezuela': '委内瑞拉',
                        'Vietnam': '越南',
                        'Vanuatu': '瓦努阿图',
                        'West Bank': '西岸',
                        'Yemen': '也门',
                        'South Africa': '南非',
                        'Zambia': '赞比亚',
                        'Zimbabwe': '津巴布韦'
                    },
                    flat: false, /*是否使用平面图*/
                    flatAngle: 0,
                    mapLocation: {
                        x: 0,
                        y: 0,
                        width: '100%',
                        height: '100%'
                    },
                    baseLayer: {
                        backgroundColor: 'rgba(20,143,204,.8)'
                    },
                    data:[
                        {name:'中国', selected:true}
                    ],
                    itemStyle: {
                        normal: {
                            width: 2,
                            borderWidth: 1,
                            borderColor: '#00ffff',
                            areaStyle: {
                                color: 'rgba(0, 0, 0, 0)'
                            }
                        }
                    },
                    markPoint: {
                        symbol: "circle",
                        effect: {
                            shadowBlur: 0.5
                        },
                        large: true,
                        symbolSize: 5,
                        data: airports
                    },
                    roam: {
                        // autoRotate: true,
                        autoRotate: 1,
                        focus: '中国',

                        zoom: 1.3,
                        minZoom: 1.3,
                        maxZoom: 1.3
                        // preserve: true,

                    }
                }]
            };

            //默认选中
            opts.legend.data.forEach(function (name) {
                opts.legend.selected[name] = true;
            });
            /*
             "青岛":[120.33,36.07],
             "北京":[116.46,39.92],
             */
            for (var x = 0; x < mData.length; x++) {
                opts.series.push({
                    type: 'map3d',
                    name: mData[x].shortname,
                    markLine: {
                        smooth: true,
                        effect: {
                            show: true
                        },
                        itemStyle: {
                            normal: {
                                // 线的颜色默认是取 legend 的颜色
                                // color: null
                                // 线宽，这里线宽是屏幕的像素大小
                                width: 5,
                                // 线的透明度
                                opacity: 1,
                                // color:"rgba(50,143,204,1)",
                                color: "#7bb4ff",
                                borderWidth: 5,
                                borderColor: "#7bb4ff",
                                lineStyle: {
                                    type: 'solid',
                                    shadowBlur: 5
                                }
                            }
                        },
                        distance: 0,
                        data: lineGeoCoord(mData[x])
                    }

                });
            }

            // myChart.hideLoading();


        }

    });
    return opts;

}