package genetic;
import java.util.ArrayList;
class Thought38 extends Thought{
private static ArrayList<Thought38> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 550.7799509371326;
private double fd1 = 327.86251436861284;
private Thought fo0 = null;
private Thought fo1 = null;
Thought38 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought38 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought38 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld1 = 225.06963217857816;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought62.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ld1 = fd0 - fd1;
    boolean lb3 = false;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 559.6454090739829;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought294.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
}
    boolean lb4 = false;
    lb4 = ab1 && ab2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        }
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !fb0;
    fb1 = ad2 < ad3;
    double ld0 = 704.1618293896879;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[4][4] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
    Output.points[4][5] -= ad4;
    fd0 = fd1 - ld0;
    ad1 = ad2 - ad3;
    lb1 = fb0 && fb1;
    lb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    double ld0 = 301.4014916991553;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought314.getInstance();
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(ad4, fd0, fd1, ld0);
}
    Thought lo4 = Thought212.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ad1, lb3, ab1, ab2, ab3);
}
    boolean lb5 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld2 = 553.9912853326252;
    lb1 = !fb0;
    Output.points[4][6] -= fd0;
    fd1 = ld2 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    boolean lb3 = true;
    lb1 = !lb3;
    Output.points[4][7] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 739.4437965075583;
if(fo1 != null){
      fo1.m2(ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
if(ao1 != null){
      ao1.m2();
}
    Output.points[4][8] -= fd1;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought286.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = ab1 || ab2;
    Output.points[5][0] += fd1;
    double ld1 = 768.8724191220691;
    ab3 = ld1 < fd0;
    double ld2 = 180.87555587191062;
    ab4 = !fb0;
    double ld3 = 180.3965488048874;
if(ao3 != null){
      ao2 = ao3.m4(ld3, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought345.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
    ld2 *= -1;
    Thought lo5 = Thought277.getInstance();
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    double ld0 = 333.52105612773147;
if(ao1 != null){
      ad3 = ao1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
    ab4 = ad4 > fd0;
    fd1 = ld0 + ad1;
    Thought lo1 = Thought27.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 292.04950892620235;
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[5][1] += fd1;
    fd0 = fd1 - fd0;
    lb0 = lb1 && ab1;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    double ld2 = 861.2156973289088;
    Thought lo3 = Thought172.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb1 = fo0.m2(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    Thought lo4 = Thought78.getInstance(ld2, fd0, fd1, ld2, lb0, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fd0 *= -1;
    fb1 = fd1 > ld2;
    lb0 = fd0 < fd1;
    Output.points[5][2] += ld2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    ab2 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought291.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought207.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 726.4821707326583;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 < fd1;
    ld1 = ad1 - ad2;
    boolean lb2 = true;
    if (lb2) {
        ab1 = ab2 || ab3;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
        ab4 = !fb0;
        } else {
        fb1 = lb0 && lb2;
        ab1 = ad3 < ad4;
        ab2 = ab3 || ab4;
        fb0 = fd0 > fd1;
        ld1 *= -1;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought54.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fb1 = ao1.m2();
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    Output.points[5][3] -= fd1;
        fb1 = fd0 < fd1;
    Output.points[5][4] -= fd0;
    Output.points[5][5] += fd1;
    for(int i0=0; i0<10; i0++){
        lb1 = fb0 || fb1;
        Thought lo2 = Thought118.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 *= -1;
        fd0 *= -1;
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
        boolean lb3 = true;
        fd0 = fd1 + fd0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][6] -= ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought174.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    fd1 *= -1;
    lb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad1 = ad2 + ad3;
    fb1 = lb1 || fb0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            lb1 = fb0 && fb1;
            lb1 = fb0 || fb1;
            boolean lb2 = true;
            boolean lb3 = true;
            lb2 = ad4 < fd0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb3, lb1, fb0, fb1);
}
            Thought lo4 = Thought95.getInstance(lb2, lb3, lb1, fb0);
            fb1 = !lb2;
            boolean lb5 = true;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1);
}
            ad4 *= -1;
            lb3 = !lb5;
            lb1 = fb0 && fb1;
            lb2 = !lb3;
            lb5 = fd0 > fd1;
            ad1 = ad2 - ad3;
            ad4 *= -1;
}}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought321.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fd0 = ao2.m3();
}
        fb0 = fb1 || ab1;
        ab2 = ab3 && ab4;
        fb0 = !fb1;
        Thought lo1 = Thought62.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        fb0 = fd1 > fd0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ab2 = ab3 || ab4;
        fb0 = ad2 > ad3;
        boolean lb0 = true;
if(ao1 != null){
          ao1.m3(fb0, fb1, lb0, ab1);
}
        Output.points[5][7] -= ad4;
        Thought lo1 = Thought258.getInstance(ao2, ao3, ao4, fo0);
        Output.points[5][8] -= fd0;
        fd1 = ad1 + ad2;
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
        ab2 = ad1 < ad2;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
        ab4 = !fb0;
        double ld3 = 781.1834290479916;
        Output.points[6][0] += fd0;
        fb1 = fd1 > ld3;
        ad1 = ad2 - ad3;
        lb0 = ad4 > fd0;
        lb2 = fd1 < ld3;
if(ao2 != null){
          ad1 = ao2.m3();
}
        ab1 = ad2 > ad3;
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought333.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[6][1] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought321.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld2 = 869.0183481716268;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld0 = 771.027766457686;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Thought lo1 = Thought275.getInstance(ab1, ab2, ab3, ab4);
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = true;
    ab2 = ld0 < fd0;
    double ld5 = 806.9735450446012;
    Output.points[6][2] += fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][3] += ad1;
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought63.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    Output.points[6][4] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought282.getInstance();
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought59.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb1 = !lb0;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    if (lb0) {
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Thought lo0 = Thought274.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    double ld1 = 361.2739957241286;
    Output.points[6][5] += fd0;
    Thought lo2 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad3 = fo1.m3(fb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought12.getInstance(fo0, fo1, fo0, fo1);
    if (ab4) {
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld1, ad1);
}
        boolean lb4 = true;
        ab4 = ad2 > ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
        fb0 = !fb1;
        lb4 = !ab1;
        ad2 *= -1;
        ab2 = ab3 || ab4;
        } else if (fb1) {
        ab1 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
        boolean lb5 = true;
        double ld6 = 480.21770257439937;
        boolean lb7 = true;
        ab4 = ad1 > ad2;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought217.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 < fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    double ld0 = 943.6239983380616;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
if(ao3 != null){
          ao3.m3(ad4, fd0, fd1, ld0, lb2, lb3, fb0, fb1);
}
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, lb1, lb2, lb3, fb0);
}
        boolean lb4 = false;
        fb0 = fb1 || lb4;
        boolean lb5 = false;
        boolean lb6 = false;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ad2 = ad3 + ad4;
        lb5 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, lb6, lb1, lb2, lb3);
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb4, lb5, lb6);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought31.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought276.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3();
}
    Thought lo3 = Thought249.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb4 = true;
        }
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
    lb5 = ab1 || ab2;
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, lb5, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb2, lb5, ab1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
          ad1 = ao1.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        }
    for(int i1=0; i1<10; i1++){
        ad2 = ad3 + ad4;
        boolean lb2 = false;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
        boolean lb3 = true;
        double ld4 = 589.472915366501;
        double ld5 = 149.0908758830487;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][6] += fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    double ld1 = 191.3532938960728;
    Output.points[6][7] -= fd0;
    boolean lb2 = false;
    double ld3 = 384.34203899566154;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
    Output.points[6][8] += fd0;
    fd1 = ld1 + ld3;
    lb2 = !fb0;
    fb1 = lb0 && lb2;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab3 = fd0 > fd1;
    fd0 *= -1;
    double ld0 = 491.4515218147281;
    ab4 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
    Output.points[7][0] += fd0;
    fb0 = fd1 < ld0;
    Output.points[7][1] += fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, ab1);
}
    Output.points[7][2] -= ld0;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    if (lb1) {
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
        Thought lo2 = Thought23.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
        ab2 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][3] += ad2;
        boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    Output.points[7][4] -= ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
    double ld3 = 519.8629915550086;
if(fo1 != null){
      fo1.m2(lb0, lb1, lb2, fb0);
}
    double ld4 = 526.0978003058756;
    ld4 = ad1 - ad2;
    ad3 *= -1;
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 720.3813509643745;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
    ab4 = ad1 > ad2;
    fb0 = !fb1;
    Thought lo2 = Thought62.getInstance(ad3, ad4, fd0, fd1);
    ld0 = ad1 + ad2;
    lb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought178.getInstance();
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fd1 *= -1;
        fd0 = fd1 - fd0;
        boolean lb1 = false;
        double ld2 = 304.75307787564475;
        lb1 = fb0 && fb1;
if(ao3 != null){
          lb1 = ao3.m2(fb0, fb1, lb1, fb0);
}
        double ld3 = 219.1503627024464;
        ld3 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m2(ld2, ld3, fd0, fd1);
}
        Thought lo4 = Thought143.getInstance(fo0, fo1, ao1, ao2, ld2, ld3, fd0, fd1);
if(ao3 != null){
          fb1 = ao3.m2(ld2, ld3, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fb0 = ld2 < ld3;
        fb1 = !lb1;
        fb0 = !fb1;
        boolean lb5 = true;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[7][5] -= ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought31.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    boolean lb2 = true;
    ad1 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought39.getInstance(ad2, ad3, ad4, fd0);
    double ld4 = 418.54806361961323;
    double ld5 = 486.63126076610104;
    boolean lb6 = true;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld4);
}
    lb2 = ld5 > ad1;
    boolean lb7 = false;
    lb6 = lb7 || fb0;
    boolean lb8 = false;
    if (fb0) {
        Thought lo9 = Thought224.getInstance(ad2, ad3, ad4, fd0, fb1, lb1, lb2, lb6);
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb7, lb8, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    Thought lo1 = Thought361.getInstance();
    Thought lo2 = Thought219.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo3 = Thought238.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ad2 = ao1.m3(ab4, fb0, fb1, ab1);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    Output.points[7][6] += ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought368.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    ad1 = ad2 - ad3;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb3, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad4 = fd0 - fd1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought391.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    Output.points[7][7] -= fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    Output.points[7][8] -= fd0;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld1 = 82.41569873367169;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    lb2 = fd0 > fd1;
    ld1 = fd0 - fd1;
    Thought lo3 = Thought51.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    fd1 = ld1 - fd0;
    Thought lo4 = Thought174.getInstance();
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(lb2, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    double ld1 = 340.45352122036905;
    fb1 = lb0 && fb0;
    Thought lo2 = Thought93.getInstance(ld1, fd0, fd1, ld1);
        fb1 = fd0 > fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    lb0 = !lb3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
