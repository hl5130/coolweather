package com.example.hongliang.coolweather.gson;

import java.util.List;

/**
 * Created by hongliang on 2017/3/11.
 */

public class Alarm {

    private List<HeWeather5Bean> HeWeather5;

    public List<HeWeather5Bean> getHeWeather5() {
        return HeWeather5;
    }

    public void setHeWeather5(List<HeWeather5Bean> HeWeather5) {
        this.HeWeather5 = HeWeather5;
    }

    public static class HeWeather5Bean {
        /**
         * basic : {"city":"成都","cnty":"中国","id":"CN101270101","lat":"30.670000","lon":"104.071000","update":{"loc":"2017-03-11 18:52","utc":"2017-03-11 10:52"}}
         * status : ok
         * alarms : [{"level":"蓝色","stat":"预警中","title":"天津市气象台发布大风蓝色预警","txt":"预计今天后半夜到明天夜间我区将受大风影响，平均风力达到6级，阵风7级以上。请有关单位和人员作好防范准备","type":"大风"}]
         */

        private BasicBean basic;
        private String status;
        private List<AlarmsBean> alarms;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<AlarmsBean> getAlarms() {
            return alarms;
        }

        public void setAlarms(List<AlarmsBean> alarms) {
            this.alarms = alarms;
        }

        public static class BasicBean {
            /**
             * city : 成都
             * cnty : 中国
             * id : CN101270101
             * lat : 30.670000
             * lon : 104.071000
             * update : {"loc":"2017-03-11 18:52","utc":"2017-03-11 10:52"}
             */

            private String city;
            private String cnty;
            private String id;
            private String lat;
            private String lon;
            private UpdateBean update;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public UpdateBean getUpdate() {
                return update;
            }

            public void setUpdate(UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
                /**
                 * loc : 2017-03-11 18:52
                 * utc : 2017-03-11 10:52
                 */

                private String loc;
                private String utc;

                public String getLoc() {
                    return loc;
                }

                public void setLoc(String loc) {
                    this.loc = loc;
                }

                public String getUtc() {
                    return utc;
                }

                public void setUtc(String utc) {
                    this.utc = utc;
                }
            }
        }

        public static class AlarmsBean {
            /**
             * level : 蓝色
             * stat : 预警中
             * title : 天津市气象台发布大风蓝色预警
             * txt : 预计今天后半夜到明天夜间我区将受大风影响，平均风力达到6级，阵风7级以上。请有关单位和人员作好防范准备
             * type : 大风
             */

            private String level;
            private String stat;
            private String title;
            private String txt;
            private String type;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getStat() {
                return stat;
            }

            public void setStat(String stat) {
                this.stat = stat;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
