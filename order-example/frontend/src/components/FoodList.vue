<template>

<v-data-table
    :headers="headers"
    :items="foodList"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'FoodList',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
        ],
        foodList : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/foodlists')

      this.foodList = temp.data._embedded.foodlists;

    },
    methods: {
    }
  }
</script>

