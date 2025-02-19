
import axios from 'axios';
import React, { useState } from 'react'
import { Alert, View, StyleSheet} from 'react-native';
import { Button, Card, Text, TextInput } from 'react-native-paper';

const Login = (props) => {
    const [credentials, setCredentials] = useState({ email: "", password: "" });
   
  const handleLogin = async () => {
    const { email, password } = credentials;
    if (!email || !password) {
      Alert.alert("Please Enter Email and Password");
      return;
    }
    try {
      const response = await axios.post('http://192.168.133.142:7777/theatre_admin/login', credentials);
      if (response.data === 'Success') {
        console.log(response.data);
        props.navigation.navigate('Dashboard');
      } else {
        Alert.alert('Login Failed', 'Invalid email or password.');
      }
    } catch (error) {
      Alert.alert('Error', 'Unable to connect. Please try again later.');
    }
  };

  return (
    <View style={styles.container}>
    <Card style={styles.card}>
      <Text style={styles.title}>Login</Text>

      <TextInput
        label="Email"
        mode="outlined"
        value={credentials.email}
        onChangeText={(email) => setCredentials({ ...credentials, email })}
        style={styles.input}
      />
      <TextInput
        label="Password"
        mode="outlined"
        secureTextEntry
        value={credentials.password}
        onChangeText={(password) => setCredentials({ ...credentials, password })}
        style={styles.input}
      />
      <Button onPress={handleLogin} mode="contained" style={styles.button}>
        Login
      </Button>

    
    </Card>
  </View>
  );
}

export default Login

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        padding: 20,
      },
      card: {
        padding: 20,
        backgroundColor: '#f5f5f5',
      },
      title: {
        textAlign: 'center',
        fontSize: 30,
        fontWeight: 'bold',
        marginBottom: 20,
      },
      input: {
        marginBottom: 10,
      },
      button: {
        backgroundColor: 'black',
        marginVertical: 10,
      }

})