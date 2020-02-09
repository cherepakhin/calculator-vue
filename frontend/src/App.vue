<template>
  <v-app>
    <calc-head />
    <v-content class="mx-10">
      <calc-form v-bind:vcredit="vcredit" v-bind:onClick="onOutClick" />
      <div class="red--text">{{`Годовой процент: ${(vcredit.percent*100)}%`}}</div>
      <v-banner class="grey lighten-3 mt-4">Платежи</v-banner>
      <v-simple-table class="mb-12 v-card v-card--outlined">
        <template v-slot:default>
          <thead>
            <tr>
              <th class="text-left">Дата</th>
              <th class="text-right">Платеж по основному долгу</th>
              <th class="text-right">Платеж по процентам</th>
              <th class="text-right">Общая сумма платежа</th>
              <th class="text-right">Задолженность по кредиту</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="p in vcredit.payments" :key="p.date">
              <td>{{ p.date }}</td>
              <td class="text-right">{{ p.payDebt.toFixed(2) }}</td>
              <td class="text-right">{{ p.payPercent.toFixed(2) }}</td>
              <td class="text-right">{{ (p.payDebt+p.payPercent).toFixed(2) }}</td>
              <td class="text-right">{{ p.sumLastDebtCredit.toFixed(2) }}</td>
            </tr>
          </tbody>
        </template>
      </v-simple-table>
    </v-content>
  </v-app>
</template>

<script>
import CalcHead from "./components/CalcHead";
import CalcForm from "./components/CalcForm";
import { AXIOS } from "./util/http_commons";

export default {
  name: "App",

  components: {
    CalcHead,
    CalcForm
  },
  data: () => {
    return {
      vcredit: {
        months: 12,
        sumCredit: 1000,
        percent: 0.1,
        payments: []
      }
    };
  },
  methods: {
    onOutClick: function(_credit) {
      console.log(JSON.stringify(_credit));
      // this.$data.vcredit = { ..._credit };
      AXIOS.post("", { months: _credit.months, credit: _credit.sumCredit })
        .then(response => {
          console.log(response);
          this.$data.vcredit = { ...response.data };
        })
        .catch(error => {
          console.log("ERROR: " + error.response.data);
        });
    }
  }
};
</script>
