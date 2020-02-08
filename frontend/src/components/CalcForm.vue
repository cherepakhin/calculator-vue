<template>
  <div class="calcform">
    <v-form>
      <v-row>
        <v-col cols="12" md="4">
          <v-text-field v-model="months" label="Срок кредита в месяцах" required type="number" />
        </v-col>
        <v-col cols="12" md="4">
          <v-text-field v-model="credit" label="Сумма кредита" required type="number" />
        </v-col>
        <v-col cols="12" md="4" class="my-2">
          <v-btn color="primary">Расчитать</v-btn>
        </v-col>
      </v-row>
    </v-form>
  </div>
</template>

<script>
export default {
  name: "CalcForm",

  data: () => ({
    months: 3,
    credit: 3
  })
};
</script>
