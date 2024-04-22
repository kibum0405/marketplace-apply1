<template>
    <v-card outlined>
        <v-card-title>
            CompanyCreated1
        </v-card-title>

        <v-card-text>
            <String label="DisplayNmae" v-model="value.displayNmae" :editMode="editMode"/>
            <String label="CompanyId" v-model="value.companyId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="companyCreated1"
            >
                CompanyCreated1
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CompanyCreated1Command',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.displayNmae = '';
            this.value.companyId = '';
        },
        watch: {
        },
        methods: {
            companyCreated1() {
                this.$emit('companyCreated1', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

