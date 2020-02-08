<template>
  <v-app>
    <CalcHead />
    <v-content class="mx-10">
      <CalcForm />
    </v-content>
  </v-app>
</template>

<script>
import CalcHead from "./components/CalcHead";
import CalcForm from "./components/CalcForm";

export default {
  name: "App",

  components: {
    CalcHead,
    CalcForm
  },

  data: () => ({
    //
  })
};
</script>
