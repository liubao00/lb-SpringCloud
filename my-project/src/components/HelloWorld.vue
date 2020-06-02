<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <form method="post" action="">
      <div>
        用户:<input placeholder="admin">
      </div>
      <br>
      <div class="align-center">
        密码:<input placeholder="123456">
      </div>
      <br>
      <div class="align-center">
        <button type="button">登录</button>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: '2020 后台登录系统'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

.align-center {
  width: 100%;
  height: 1rem;
  line-height: 1rem;
  text-align: center;
}
</style>
