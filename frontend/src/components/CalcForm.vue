<template>
  <div class="calcform">
    <v-form>
      <v-row>
        <v-col cols="12" md="4">
          <v-text-field
            v-model.number="creditDto.months"
            label="Срок кредита в месяцах"
            required
            type="number"
          />
        </v-col>
        <v-col cols="12" md="4">
          <v-text-field
            v-model.number="creditDto.sumCredit"
            label="Сумма кредита"
            required
            type="number"
          />
        </v-col>
        <v-col cols="12" md="4" class="my-2">
          <v-btn v-on:click="calc" color="primary">Расчитать</v-btn>
        </v-col>
      </v-row>
    </v-form>
  </div>
</template>

<script>
export default {
  name: "CalcForm",
  props: {
    vcredit: {
      months: Number,
      sumCredit: Number
    },
    onClick: Function
  },
  data: function() {
    return {
      creditDto: {
        months: this.vcredit.months,
        sumCredit: this.vcredit.sumCredit
      }
    };
  },
  methods: {
    calc: function() {
      console.log(`vcredit=${JSON.stringify(this.vcredit)}`);
      console.log(`creditDto=${JSON.stringify(this.creditDto)}`);
      this.onClick(this.creditDto);
    }
  }
};
</script>
